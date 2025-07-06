package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadQuestionOutline: ImageVector
    get() {
        if (_HeadQuestionOutline != null) {
            return _HeadQuestionOutline!!
        }
        _HeadQuestionOutline = ImageVector.Builder(
            name = "HeadQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(16.88f, 3f, 20f, 6.14f, 20f, 10f)
                curveTo(20f, 12.8f, 18.37f, 15.19f, 16f, 16.31f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(8f)
                curveTo(6.89f, 18f, 6f, 17.11f, 6f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(4.5f)
                curveTo(4.08f, 13f, 3.84f, 12.5f, 4.08f, 12.19f)
                lineTo(6f, 9.66f)
                curveTo(6.19f, 5.95f, 9.23f, 3f, 13f, 3f)
                moveTo(10.32f, 7.39f)
                horizontalLineTo(12.25f)
                curveTo(12.26f, 7.09f, 12.35f, 6.86f, 12.53f, 6.7f)
                curveTo(12.71f, 6.55f, 12.93f, 6.47f, 13.19f, 6.47f)
                curveTo(13.5f, 6.47f, 13.76f, 6.57f, 13.94f, 6.75f)
                curveTo(14.12f, 6.94f, 14.2f, 7.2f, 14.2f, 7.5f)
                curveTo(14.2f, 7.82f, 14.13f, 8.09f, 13.97f, 8.32f)
                curveTo(13.83f, 8.55f, 13.62f, 8.75f, 13.36f, 8.91f)
                curveTo(12.85f, 9.25f, 12.5f, 9.55f, 12.31f, 9.82f)
                curveTo(12.11f, 10.08f, 12f, 10.5f, 12f, 11f)
                horizontalLineTo(14f)
                curveTo(14f, 10.69f, 14.04f, 10.44f, 14.13f, 10.26f)
                curveTo(14.22f, 10.07f, 14.39f, 9.9f, 14.64f, 9.74f)
                curveTo(15.09f, 9.5f, 15.46f, 9.21f, 15.75f, 8.81f)
                curveTo(16.04f, 8.41f, 16.19f, 8f, 16.19f, 7.5f)
                curveTo(16.19f, 6.74f, 15.92f, 6.13f, 15.38f, 5.68f)
                curveTo(14.85f, 5.23f, 14.12f, 5f, 13.19f, 5f)
                curveTo(12.32f, 5f, 11.62f, 5.2f, 11.08f, 5.59f)
                curveTo(10.56f, 6f, 10.3f, 6.57f, 10.31f, 7.36f)
                lineTo(10.32f, 7.39f)
                moveTo(12f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                moveTo(13f, 1f)
                curveTo(8.41f, 1f, 4.61f, 4.42f, 4.06f, 8.9f)
                lineTo(2.5f, 11f)
                lineTo(2.47f, 11f)
                lineTo(2.45f, 11.03f)
                curveTo(1.9f, 11.79f, 1.83f, 12.79f, 2.26f, 13.62f)
                curveTo(2.62f, 14.31f, 3.26f, 14.79f, 4f, 14.94f)
                verticalLineTo(16f)
                curveTo(4f, 17.85f, 5.28f, 19.42f, 7f, 19.87f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(17.5f)
                curveTo(20.5f, 15.83f, 22f, 13.06f, 22f, 10f)
                curveTo(22f, 5.03f, 17.96f, 1f, 13f, 1f)
                close()
            }
        }.build()

        return _HeadQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HeadQuestionOutline: ImageVector? = null
