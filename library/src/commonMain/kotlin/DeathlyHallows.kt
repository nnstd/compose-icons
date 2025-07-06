package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeathlyHallows: ImageVector
    get() {
        if (_DeathlyHallows != null) {
            return _DeathlyHallows!!
        }
        _DeathlyHallows = ImageVector.Builder(
            name = "DeathlyHallows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(1f, 21f)
                horizontalLineTo(23f)
                lineTo(12f, 2f)
                moveTo(12.75f, 11.47f)
                curveTo(14.56f, 11.87f, 15.7f, 13.67f, 15.3f, 15.5f)
                curveTo(15f, 16.75f, 14f, 17.75f, 12.75f, 18.03f)
                verticalLineTo(11.47f)
                moveTo(11.25f, 18f)
                curveTo(9.44f, 17.6f, 8.3f, 15.8f, 8.7f, 14f)
                curveTo(9f, 12.72f, 10f, 11.72f, 11.25f, 11.44f)
                verticalLineTo(18f)
                moveTo(16.88f, 14.72f)
                curveTo(16.83f, 12.35f, 15.09f, 10.36f, 12.75f, 10f)
                verticalLineTo(6.29f)
                lineTo(20.4f, 19.5f)
                horizontalLineTo(13.07f)
                curveTo(15.29f, 19f, 16.87f, 17.03f, 16.88f, 14.75f)
                verticalLineTo(14.72f)
                moveTo(11.25f, 6.29f)
                verticalLineTo(10f)
                curveTo(8.6f, 10.4f, 6.77f, 12.88f, 7.18f, 15.54f)
                curveTo(7.5f, 17.5f, 8.97f, 19.12f, 10.93f, 19.55f)
                horizontalLineTo(3.6f)
                lineTo(11.25f, 6.29f)
                close()
            }
        }.build()

        return _DeathlyHallows!!
    }

@Suppress("ObjectPropertyName")
private var _DeathlyHallows: ImageVector? = null
