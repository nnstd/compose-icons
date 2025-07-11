package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Island: ImageVector
    get() {
        if (_Island != null) {
            return _Island!!
        }
        _Island = ImageVector.Builder(
            name = "Island",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20f)
                curveTo(18.61f, 20f, 17.22f, 19.53f, 16f, 18.67f)
                curveTo(13.56f, 20.38f, 10.44f, 20.38f, 8f, 18.67f)
                curveTo(6.78f, 19.53f, 5.39f, 20f, 4f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                curveTo(5.37f, 22f, 6.74f, 21.65f, 8f, 21f)
                curveTo(10.5f, 22.3f, 13.5f, 22.3f, 16f, 21f)
                curveTo(17.26f, 21.65f, 18.62f, 22f, 20f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                moveTo(20.78f, 19f)
                horizontalLineTo(20f)
                curveTo(18.82f, 19f, 17.64f, 18.6f, 16.58f, 17.85f)
                lineTo(16f, 17.45f)
                lineTo(15.42f, 17.85f)
                curveTo(14.39f, 18.57f, 13.21f, 18.95f, 12f, 18.95f)
                curveTo(10.77f, 18.95f, 9.59f, 18.57f, 8.56f, 17.85f)
                lineTo(8f, 17.45f)
                lineTo(7.43f, 17.85f)
                curveTo(6.36f, 18.6f, 5.18f, 19f, 4f, 19f)
                horizontalLineTo(3.22f)
                curveTo(3.75f, 17.54f, 5.58f, 15f, 12f, 15f)
                curveTo(14f, 15f, 15f, 15.24f, 15f, 15.24f)
                curveTo(15.68f, 13.87f, 16.83f, 10.77f, 16f, 6.82f)
                lineTo(17.06f, 7.53f)
                curveTo(17.39f, 8.96f, 18f, 11.75f, 16.8f, 15.65f)
                curveTo(19.43f, 16.5f, 20.42f, 18f, 20.78f, 19f)
                moveTo(22f, 7.59f)
                curveTo(21.21f, 6.5f, 20f, 5.71f, 18.58f, 5.53f)
                curveTo(18.7f, 5.67f, 18.81f, 5.83f, 18.92f, 6f)
                curveTo(20.12f, 7.91f, 19.87f, 10.32f, 18.47f, 11.95f)
                curveTo(19.06f, 10.5f, 19f, 8.79f, 18.08f, 7.36f)
                curveTo(18f, 7.28f, 17.96f, 7.2f, 17.9f, 7.11f)
                curveTo(17.5f, 6.53f, 16.96f, 6.06f, 16.38f, 5.72f)
                curveTo(14.35f, 6.37f, 12.88f, 8.27f, 12.88f, 10.5f)
                curveTo(12.88f, 11.03f, 12.96f, 11.53f, 13.1f, 12f)
                curveTo(12.5f, 11.17f, 12.16f, 10.17f, 12.16f, 9.07f)
                curveTo(12.16f, 7.41f, 12.96f, 5.95f, 14.2f, 5.03f)
                curveTo(13.16f, 4.95f, 12.09f, 5.18f, 11.14f, 5.78f)
                curveTo(10.7f, 6.05f, 10.32f, 6.38f, 10f, 6.76f)
                curveTo(10.39f, 5.82f, 11.05f, 5f, 12f, 4.4f)
                curveTo(13.04f, 3.74f, 14.25f, 3.5f, 15.39f, 3.69f)
                curveTo(15.1f, 3.29f, 14.75f, 2.92f, 14.33f, 2.6f)
                curveTo(13.92f, 2.29f, 13.47f, 2.05f, 13f, 1.88f)
                curveTo(14f, 1.91f, 15.04f, 2.24f, 15.91f, 2.89f)
                curveTo(16.35f, 3.22f, 16.7f, 3.62f, 17f, 4.05f)
                curveTo(17.06f, 4.05f, 17.12f, 4.04f, 17.19f, 4.04f)
                curveTo(19.45f, 4.04f, 21.37f, 5.53f, 22f, 7.59f)
                close()
            }
        }.build()

        return _Island!!
    }

@Suppress("ObjectPropertyName")
private var _Island: ImageVector? = null
