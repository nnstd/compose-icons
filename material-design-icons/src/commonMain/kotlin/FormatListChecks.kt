package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListChecks: ImageVector
    get() {
        if (_FormatListChecks != null) {
            return _FormatListChecks!!
        }
        _FormatListChecks = ImageVector.Builder(
            name = "FormatListChecks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                moveTo(5f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                moveTo(11f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(11f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(5f, 20f)
                lineTo(1.5f, 16.5f)
                lineTo(2.91f, 15.09f)
                lineTo(5f, 17.17f)
                lineTo(9.59f, 12.59f)
                lineTo(11f, 14f)
                lineTo(5f, 20f)
                close()
            }
        }.build()

        return _FormatListChecks!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListChecks: ImageVector? = null
