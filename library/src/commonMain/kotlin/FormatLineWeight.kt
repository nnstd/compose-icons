package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatLineWeight: ImageVector
    get() {
        if (_FormatLineWeight != null) {
            return _FormatLineWeight!!
        }
        _FormatLineWeight = ImageVector.Builder(
            name = "FormatLineWeight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                moveTo(3f, 20f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(20f)
                moveTo(3f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                moveTo(3f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _FormatLineWeight!!
    }

@Suppress("ObjectPropertyName")
private var _FormatLineWeight: ImageVector? = null
