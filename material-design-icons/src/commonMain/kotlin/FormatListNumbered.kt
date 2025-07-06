package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListNumbered: ImageVector
    get() {
        if (_FormatListNumbered != null) {
            return _FormatListNumbered!!
        }
        _FormatListNumbered = ImageVector.Builder(
            name = "FormatListNumbered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(7f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                moveTo(7f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(3f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                moveTo(2f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                horizontalLineTo(2f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(18.5f)
                horizontalLineTo(3f)
                verticalLineTo(17.5f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                moveTo(4.25f, 10f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10.75f)
                curveTo(5f, 10.95f, 4.92f, 11.14f, 4.79f, 11.27f)
                lineTo(3.12f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(2f)
                verticalLineTo(13.08f)
                lineTo(4f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(10f)
                horizontalLineTo(4.25f)
                close()
            }
        }.build()

        return _FormatListNumbered!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListNumbered: ImageVector? = null
