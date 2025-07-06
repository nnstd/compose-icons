package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PotSteam: ImageVector
    get() {
        if (_PotSteam != null) {
            return _PotSteam!!
        }
        _PotSteam = ImageVector.Builder(
            name = "PotSteam",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 19f)
                curveTo(19f, 20.11f, 18.11f, 21f, 17f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.11f, 5f, 19f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                moveTo(8f, 1.5f)
                curveTo(6.15f, 1.5f, 4.65f, 3f, 4.65f, 4.85f)
                curveTo(4.65f, 6.7f, 6.15f, 8.2f, 8f, 8.2f)
                horizontalLineTo(9.53f)
                curveTo(9.92f, 8.2f, 10.29f, 8.3f, 10.61f, 8.5f)
                horizontalLineTo(12.63f)
                curveTo(12.05f, 7.45f, 10.86f, 6.75f, 9.53f, 6.75f)
                horizontalLineTo(8f)
                curveTo(7f, 6.75f, 6.15f, 5.77f, 6.15f, 4.75f)
                curveTo(6.15f, 3.73f, 7f, 3f, 8f, 3f)
                moveTo(12.85f, 2f)
                curveTo(12.85f, 3f, 12f, 3.85f, 11f, 3.85f)
                verticalLineTo(5.35f)
                curveTo(12.92f, 5.35f, 14.5f, 6.7f, 14.89f, 8.5f)
                horizontalLineTo(16.42f)
                curveTo(16.12f, 6.67f, 14.96f, 5.15f, 13.35f, 4.38f)
                curveTo(13.97f, 3.77f, 14.35f, 2.93f, 14.35f, 2f)
                close()
            }
        }.build()

        return _PotSteam!!
    }

@Suppress("ObjectPropertyName")
private var _PotSteam: ImageVector? = null
