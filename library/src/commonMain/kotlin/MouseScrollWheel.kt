package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MouseScrollWheel: ImageVector
    get() {
        if (_MouseScrollWheel != null) {
            return _MouseScrollWheel!!
        }
        _MouseScrollWheel = ImageVector.Builder(
            name = "MouseScrollWheel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 1.07f)
                curveTo(7.05f, 1.56f, 4f, 4.92f, 4f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(7.73f)
                curveTo(10.4f, 7.39f, 10f, 6.74f, 10f, 6f)
                verticalLineTo(4f)
                curveTo(10f, 3.26f, 10.4f, 2.61f, 11f, 2.27f)
                verticalLineTo(1.07f)
                moveTo(13f, 9f)
                verticalLineTo(7.73f)
                curveTo(13.6f, 7.39f, 14f, 6.74f, 14f, 6f)
                verticalLineTo(4f)
                curveTo(14f, 3.26f, 13.6f, 2.61f, 13f, 2.27f)
                verticalLineTo(1.07f)
                curveTo(16.94f, 1.56f, 20f, 4.92f, 20f, 9f)
                horizontalLineTo(13f)
                moveTo(4f, 15f)
                curveTo(4f, 17.12f, 4.84f, 19.16f, 6.34f, 20.66f)
                curveTo(7.84f, 22.16f, 9.88f, 23f, 12f, 23f)
                curveTo(14.12f, 23f, 16.16f, 22.16f, 17.66f, 20.66f)
                curveTo(19.16f, 19.16f, 20f, 17.12f, 20f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(13f, 6f)
                verticalLineTo(4f)
                curveTo(13f, 3.45f, 12.55f, 3f, 12f, 3f)
                curveTo(11.45f, 3f, 11f, 3.45f, 11f, 4f)
                verticalLineTo(6f)
                curveTo(11f, 6.55f, 11.45f, 7f, 12f, 7f)
                curveTo(12.55f, 7f, 13f, 6.55f, 13f, 6f)
                close()
            }
        }.build()

        return _MouseScrollWheel!!
    }

@Suppress("ObjectPropertyName")
private var _MouseScrollWheel: ImageVector? = null
