package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListGroupPlus: ImageVector
    get() {
        if (_FormatListGroupPlus != null) {
            return _FormatListGroupPlus!!
        }
        _FormatListGroupPlus = ImageVector.Builder(
            name = "FormatListGroupPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                moveTo(20f, 11f)
                verticalLineTo(12.3f)
                curveTo(19.4f, 12.1f, 18.7f, 12f, 18f, 12f)
                curveTo(16.8f, 12f, 15.6f, 12.4f, 14.7f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                moveTo(12.1f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(12.8f)
                curveTo(12.5f, 15.6f, 12.2f, 16.3f, 12.1f, 17f)
                moveTo(7f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(5f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatListGroupPlus!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListGroupPlus: ImageVector? = null
