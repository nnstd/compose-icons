package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Meditation: ImageVector
    get() {
        if (_Meditation != null) {
            return _Meditation!!
        }
        _Meditation = ImageVector.Builder(
            name = "Meditation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4f)
                curveTo(13.11f, 4f, 14f, 4.89f, 14f, 6f)
                reflectiveCurveTo(13.11f, 8f, 12f, 8f)
                reflectiveCurveTo(10f, 7.11f, 10f, 6f)
                reflectiveCurveTo(10.9f, 4f, 12f, 4f)
                moveTo(21f, 16f)
                verticalLineTo(14f)
                curveTo(18.76f, 14f, 16.84f, 13.04f, 15.4f, 11.32f)
                lineTo(14.06f, 9.72f)
                curveTo(13.68f, 9.26f, 13.12f, 9f, 12.53f, 9f)
                horizontalLineTo(11.5f)
                curveTo(10.89f, 9f, 10.33f, 9.26f, 9.95f, 9.72f)
                lineTo(8.61f, 11.32f)
                curveTo(7.16f, 13.04f, 5.24f, 14f, 3f, 14f)
                verticalLineTo(16f)
                curveTo(5.77f, 16f, 8.19f, 14.83f, 10f, 12.75f)
                verticalLineTo(15f)
                lineTo(6.12f, 16.55f)
                curveTo(5.45f, 16.82f, 5f, 17.5f, 5f, 18.21f)
                curveTo(5f, 19.2f, 5.8f, 20f, 6.79f, 20f)
                horizontalLineTo(9f)
                verticalLineTo(19.5f)
                curveTo(9f, 18.12f, 10.12f, 17f, 11.5f, 17f)
                horizontalLineTo(14.5f)
                curveTo(14.78f, 17f, 15f, 17.22f, 15f, 17.5f)
                reflectiveCurveTo(14.78f, 18f, 14.5f, 18f)
                horizontalLineTo(11.5f)
                curveTo(10.67f, 18f, 10f, 18.67f, 10f, 19.5f)
                verticalLineTo(20f)
                horizontalLineTo(17.21f)
                curveTo(18.2f, 20f, 19f, 19.2f, 19f, 18.21f)
                curveTo(19f, 17.5f, 18.55f, 16.82f, 17.88f, 16.55f)
                lineTo(14f, 15f)
                verticalLineTo(12.75f)
                curveTo(15.81f, 14.83f, 18.23f, 16f, 21f, 16f)
                close()
            }
        }.build()

        return _Meditation!!
    }

@Suppress("ObjectPropertyName")
private var _Meditation: ImageVector? = null
