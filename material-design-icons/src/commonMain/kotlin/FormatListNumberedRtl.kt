package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListNumberedRtl: ImageVector
    get() {
        if (_FormatListNumberedRtl != null) {
            return _FormatListNumberedRtl!!
        }
        _FormatListNumberedRtl = ImageVector.Builder(
            name = "FormatListNumberedRtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                moveTo(3f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                moveTo(3f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                moveTo(20f, 8f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(19f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(18.5f)
                horizontalLineTo(20f)
                verticalLineTo(17.5f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                moveTo(21.25f, 10f)
                curveTo(21.67f, 10f, 22f, 10.34f, 22f, 10.75f)
                curveTo(22f, 10.95f, 21.92f, 11.14f, 21.79f, 11.27f)
                lineTo(20.12f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(13.08f)
                lineTo(21f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(21.25f)
                close()
            }
        }.build()

        return _FormatListNumberedRtl!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListNumberedRtl: ImageVector? = null
