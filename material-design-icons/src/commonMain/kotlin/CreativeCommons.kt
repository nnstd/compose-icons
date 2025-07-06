package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CreativeCommons: ImageVector
    get() {
        if (_CreativeCommons != null) {
            return _CreativeCommons!!
        }
        _CreativeCommons = ImageVector.Builder(
            name = "CreativeCommons",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.89f, 10.34f)
                lineTo(10.55f, 11.04f)
                curveTo(10.41f, 10.74f, 10.24f, 10.53f, 10.03f, 10.41f)
                curveTo(9.82f, 10.29f, 9.62f, 10.23f, 9.45f, 10.23f)
                curveTo(8.55f, 10.23f, 8.11f, 10.82f, 8.11f, 12f)
                curveTo(8.11f, 12.54f, 8.22f, 12.97f, 8.45f, 13.29f)
                curveTo(8.67f, 13.61f, 9f, 13.77f, 9.45f, 13.77f)
                curveTo(10.03f, 13.77f, 10.44f, 13.5f, 10.68f, 12.91f)
                lineTo(11.91f, 13.54f)
                curveTo(11.65f, 14.03f, 11.29f, 14.41f, 10.82f, 14.69f)
                curveTo(10.36f, 14.97f, 9.85f, 15.11f, 9.29f, 15.11f)
                curveTo(8.39f, 15.11f, 7.67f, 14.84f, 7.12f, 14.29f)
                curveTo(6.58f, 13.74f, 6.3f, 13f, 6.3f, 12f)
                curveTo(6.3f, 11.05f, 6.58f, 10.3f, 7.13f, 9.74f)
                curveTo(7.69f, 9.18f, 8.39f, 8.9f, 9.23f, 8.9f)
                curveTo(10.47f, 8.89f, 11.36f, 9.38f, 11.89f, 10.34f)
                moveTo(17.66f, 10.34f)
                lineTo(16.34f, 11.04f)
                curveTo(16.2f, 10.74f, 16f, 10.53f, 15.81f, 10.41f)
                curveTo(15.6f, 10.29f, 15.4f, 10.23f, 15.21f, 10.23f)
                curveTo(14.32f, 10.23f, 13.87f, 10.82f, 13.87f, 12f)
                curveTo(13.87f, 12.54f, 14f, 12.97f, 14.21f, 13.29f)
                curveTo(14.44f, 13.61f, 14.77f, 13.77f, 15.21f, 13.77f)
                curveTo(15.8f, 13.77f, 16.21f, 13.5f, 16.45f, 12.91f)
                lineTo(17.7f, 13.54f)
                curveTo(17.42f, 14.03f, 17.05f, 14.41f, 16.59f, 14.69f)
                curveTo(16.12f, 14.97f, 15.62f, 15.11f, 15.07f, 15.11f)
                curveTo(14.17f, 15.11f, 13.44f, 14.84f, 12.9f, 14.29f)
                curveTo(12.36f, 13.74f, 12.09f, 13f, 12.09f, 12f)
                curveTo(12.09f, 11.05f, 12.37f, 10.3f, 12.92f, 9.74f)
                curveTo(13.47f, 9.18f, 14.17f, 8.9f, 15f, 8.9f)
                curveTo(16.26f, 8.89f, 17.14f, 9.38f, 17.66f, 10.34f)
                moveTo(12f, 3.5f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 12f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20.5f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 12f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3.5f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _CreativeCommons!!
    }

@Suppress("ObjectPropertyName")
private var _CreativeCommons: ImageVector? = null
