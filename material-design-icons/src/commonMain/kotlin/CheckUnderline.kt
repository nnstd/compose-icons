package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckUnderline: ImageVector
    get() {
        if (_CheckUnderline != null) {
            return _CheckUnderline!!
        }
        _CheckUnderline = ImageVector.Builder(
            name = "CheckUnderline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 5f)
                lineTo(9f, 17f)
                lineTo(3.5f, 11.5f)
                lineTo(4.91f, 10.09f)
                lineTo(9f, 14.17f)
                lineTo(19.59f, 3.59f)
                lineTo(21f, 5f)
                moveTo(3f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _CheckUnderline!!
    }

@Suppress("ObjectPropertyName")
private var _CheckUnderline: ImageVector? = null
