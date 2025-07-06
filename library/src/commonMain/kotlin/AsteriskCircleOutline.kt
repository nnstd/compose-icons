package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AsteriskCircleOutline: ImageVector
    get() {
        if (_AsteriskCircleOutline != null) {
            return _AsteriskCircleOutline!!
        }
        _AsteriskCircleOutline = ImageVector.Builder(
            name = "AsteriskCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.61f, 20f, 4f, 16.39f, 4f, 12f)
                curveTo(4f, 7.61f, 7.61f, 4f, 12f, 4f)
                curveTo(16.39f, 4f, 20f, 7.61f, 20f, 12f)
                curveTo(20f, 16.39f, 16.39f, 20f, 12f, 20f)
                moveTo(13f, 10.27f)
                lineTo(15.83f, 8.63f)
                lineTo(16.83f, 10.37f)
                lineTo(14f, 12f)
                lineTo(16.83f, 13.63f)
                lineTo(15.83f, 15.37f)
                lineTo(13f, 13.73f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13.73f)
                lineTo(8.17f, 15.37f)
                lineTo(7.17f, 13.63f)
                lineTo(10f, 12f)
                lineTo(7.17f, 10.37f)
                lineTo(8.17f, 8.63f)
                lineTo(11f, 10.27f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(10.27f)
                close()
            }
        }.build()

        return _AsteriskCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AsteriskCircleOutline: ImageVector? = null
