package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Beta: ImageVector
    get() {
        if (_Beta != null) {
            return _Beta!!
        }
        _Beta = ImageVector.Builder(
            name = "Beta",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.23f, 17.59f)
                verticalLineTo(23.12f)
                horizontalLineTo(6.88f)
                verticalLineTo(6.72f)
                curveTo(6.88f, 5.27f, 7.31f, 4.13f, 8.16f, 3.28f)
                curveTo(9f, 2.43f, 10.17f, 2f, 11.61f, 2f)
                curveTo(13f, 2f, 14.07f, 2.34f, 14.87f, 3f)
                curveTo(15.66f, 3.68f, 16.05f, 4.62f, 16.05f, 5.81f)
                curveTo(16.05f, 6.63f, 15.79f, 7.4f, 15.27f, 8.11f)
                curveTo(14.75f, 8.82f, 14.08f, 9.31f, 13.25f, 9.58f)
                verticalLineTo(9.62f)
                curveTo(14.5f, 9.82f, 15.47f, 10.27f, 16.13f, 11f)
                curveTo(16.79f, 11.71f, 17.12f, 12.62f, 17.12f, 13.74f)
                curveTo(17.12f, 15.06f, 16.66f, 16.14f, 15.75f, 16.97f)
                curveTo(14.83f, 17.8f, 13.63f, 18.21f, 12.13f, 18.21f)
                curveTo(11.07f, 18.21f, 10.1f, 18f, 9.23f, 17.59f)
                moveTo(10.72f, 10.75f)
                verticalLineTo(8.83f)
                curveTo(11.59f, 8.72f, 12.3f, 8.4f, 12.87f, 7.86f)
                curveTo(13.43f, 7.31f, 13.71f, 6.7f, 13.71f, 6f)
                curveTo(13.71f, 4.62f, 13f, 3.92f, 11.6f, 3.92f)
                curveTo(10.84f, 3.92f, 10.25f, 4.16f, 9.84f, 4.65f)
                curveTo(9.43f, 5.14f, 9.23f, 5.82f, 9.23f, 6.71f)
                verticalLineTo(15.5f)
                curveTo(10.14f, 16.03f, 11.03f, 16.29f, 11.89f, 16.29f)
                curveTo(12.73f, 16.29f, 13.39f, 16.07f, 13.86f, 15.64f)
                curveTo(14.33f, 15.2f, 14.56f, 14.58f, 14.56f, 13.79f)
                curveTo(14.56f, 12f, 13.28f, 11f, 10.72f, 10.75f)
                close()
            }
        }.build()

        return _Beta!!
    }

@Suppress("ObjectPropertyName")
private var _Beta: ImageVector? = null
