package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadQuestion: ImageVector
    get() {
        if (_HeadQuestion != null) {
            return _HeadQuestion!!
        }
        _HeadQuestion = ImageVector.Builder(
            name = "HeadQuestion",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(9.23f, 3f, 6.19f, 5.95f, 6f, 9.66f)
                lineTo(4.08f, 12.19f)
                curveTo(3.84f, 12.5f, 4.08f, 13f, 4.5f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                curveTo(6f, 17.11f, 6.89f, 18f, 8f, 18f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(16f)
                verticalLineTo(16.31f)
                curveTo(18.37f, 15.19f, 20f, 12.8f, 20f, 10f)
                curveTo(20f, 6.14f, 16.88f, 3f, 13f, 3f)
                moveTo(14f, 14f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                moveTo(15.75f, 8.81f)
                curveTo(15.46f, 9.21f, 15.09f, 9.5f, 14.64f, 9.74f)
                curveTo(14.39f, 9.9f, 14.22f, 10.07f, 14.13f, 10.26f)
                curveTo(14.04f, 10.44f, 14f, 10.69f, 14f, 11f)
                horizontalLineTo(12f)
                curveTo(12f, 10.5f, 12.11f, 10.08f, 12.31f, 9.82f)
                curveTo(12.5f, 9.55f, 12.85f, 9.25f, 13.36f, 8.91f)
                curveTo(13.62f, 8.75f, 13.83f, 8.55f, 13.97f, 8.32f)
                curveTo(14.13f, 8.09f, 14.2f, 7.82f, 14.2f, 7.5f)
                curveTo(14.2f, 7.2f, 14.12f, 6.94f, 13.94f, 6.75f)
                curveTo(13.76f, 6.57f, 13.5f, 6.47f, 13.19f, 6.47f)
                curveTo(12.93f, 6.47f, 12.71f, 6.55f, 12.53f, 6.7f)
                curveTo(12.35f, 6.86f, 12.26f, 7.09f, 12.25f, 7.39f)
                horizontalLineTo(10.32f)
                lineTo(10.31f, 7.36f)
                curveTo(10.3f, 6.57f, 10.56f, 6f, 11.08f, 5.59f)
                curveTo(11.62f, 5.2f, 12.32f, 5f, 13.19f, 5f)
                curveTo(14.12f, 5f, 14.85f, 5.23f, 15.38f, 5.68f)
                curveTo(15.92f, 6.13f, 16.19f, 6.74f, 16.19f, 7.5f)
                curveTo(16.19f, 8f, 16.04f, 8.41f, 15.75f, 8.81f)
                close()
            }
        }.build()

        return _HeadQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _HeadQuestion: ImageVector? = null
