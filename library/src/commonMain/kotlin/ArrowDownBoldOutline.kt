package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownBoldOutline: ImageVector
    get() {
        if (_ArrowDownBoldOutline != null) {
            return _ArrowDownBoldOutline!!
        }
        _ArrowDownBoldOutline = ImageVector.Builder(
            name = "ArrowDownBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                lineTo(12f, 21f)
                lineTo(2f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(22f)
                moveTo(12f, 18f)
                lineTo(17f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                lineTo(12f, 18f)
                close()
            }
        }.build()

        return _ArrowDownBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownBoldOutline: ImageVector? = null
