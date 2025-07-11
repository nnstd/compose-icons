package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanCane: ImageVector
    get() {
        if (_HumanCane != null) {
            return _HumanCane!!
        }
        _HumanCane = ImageVector.Builder(
            name = "HumanCane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12.24f)
                verticalLineTo(22f)
                horizontalLineTo(17.06f)
                verticalLineTo(12.24f)
                curveTo(17.06f, 12.09f, 17f, 12f, 16.93f, 11.89f)
                curveTo(16.84f, 11.8f, 16.74f, 11.76f, 16.62f, 11.76f)
                curveTo(16.47f, 11.76f, 16.36f, 11.8f, 16.27f, 11.89f)
                curveTo(16.18f, 12f, 16.14f, 12.1f, 16.14f, 12.24f)
                verticalLineTo(13.16f)
                horizontalLineTo(15.23f)
                verticalLineTo(12.5f)
                curveTo(14.53f, 12.33f, 13.9f, 12.04f, 13.35f, 11.63f)
                curveTo(12.8f, 11.22f, 12.34f, 10.74f, 11.96f, 10.19f)
                lineTo(11.61f, 11.39f)
                curveTo(11.5f, 11.81f, 11.5f, 12.24f, 11.5f, 12.68f)
                lineTo(11.5f, 13f)
                lineTo(11.5f, 13.33f)
                lineTo(13.35f, 15.94f)
                verticalLineTo(22f)
                horizontalLineTo(11.5f)
                verticalLineTo(17.34f)
                lineTo(9.82f, 15f)
                lineTo(9.65f, 18.25f)
                lineTo(6.86f, 22f)
                lineTo(5.38f, 20.87f)
                lineTo(7.77f, 17.64f)
                verticalLineTo(12.68f)
                curveTo(7.77f, 12.15f, 7.82f, 11.63f, 7.91f, 11.11f)
                lineTo(8.25f, 9.54f)
                lineTo(6.86f, 10.32f)
                verticalLineTo(13.63f)
                horizontalLineTo(5f)
                verticalLineTo(9.23f)
                lineTo(10f, 6.4f)
                curveTo(10.29f, 6.26f, 10.59f, 6.18f, 10.91f, 6.18f)
                curveTo(11.23f, 6.18f, 11.54f, 6.27f, 11.83f, 6.44f)
                curveTo(12.15f, 6.62f, 12.39f, 6.88f, 12.57f, 7.23f)
                lineTo(13.31f, 8.8f)
                curveTo(13.6f, 9.38f, 14.04f, 9.87f, 14.64f, 10.26f)
                curveTo(15.23f, 10.65f, 15.89f, 10.85f, 16.62f, 10.85f)
                curveTo(17f, 10.85f, 17.32f, 11f, 17.6f, 11.24f)
                curveTo(17.88f, 11.5f, 18f, 11.83f, 18f, 12.24f)
                moveTo(12f, 2f)
                curveTo(13.11f, 2f, 14f, 2.9f, 14f, 4f)
                curveTo(14f, 5.11f, 13.11f, 6f, 12f, 6f)
                curveTo(10.9f, 6f, 10f, 5.11f, 10f, 4f)
                curveTo(10f, 2.9f, 10.9f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _HumanCane!!
    }

@Suppress("ObjectPropertyName")
private var _HumanCane: ImageVector? = null
