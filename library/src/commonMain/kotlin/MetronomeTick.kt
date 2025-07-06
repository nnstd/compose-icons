package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MetronomeTick: ImageVector
    get() {
        if (_MetronomeTick != null) {
            return _MetronomeTick!!
        }
        _MetronomeTick = ImageVector.Builder(
            name = "MetronomeTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.75f)
                lineTo(8.57f, 2.67f)
                lineTo(4.07f, 19.5f)
                curveTo(4.06f, 19.5f, 4f, 19.84f, 4f, 20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                curveTo(20f, 19.84f, 19.94f, 19.5f, 19.93f, 19.5f)
                lineTo(15.43f, 2.67f)
                lineTo(12f, 1.75f)
                moveTo(10.29f, 4f)
                horizontalLineTo(13.71f)
                lineTo(17.2f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(6.8f)
                lineTo(10.29f, 4f)
                moveTo(11f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _MetronomeTick!!
    }

@Suppress("ObjectPropertyName")
private var _MetronomeTick: ImageVector? = null
