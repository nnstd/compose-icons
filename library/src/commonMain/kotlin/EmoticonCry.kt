package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonCry: ImageVector
    get() {
        if (_EmoticonCry != null) {
            return _EmoticonCry!!
        }
        _EmoticonCry = ImageVector.Builder(
            name = "EmoticonCry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.14f, 17.57f)
                curveTo(5.14f, 16.5f, 6.32f, 14.5f, 7.57f, 12.81f)
                curveTo(8.82f, 14.5f, 10f, 16.5f, 10f, 17.57f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.57f, 20f)
                curveTo(6.23f, 20f, 5.14f, 18.91f, 5.14f, 17.57f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(11.08f, 22f, 10.18f, 21.86f, 9.33f, 21.63f)
                curveTo(10.9f, 20.95f, 12f, 19.39f, 12f, 17.57f)
                curveTo(12f, 17.12f, 11.89f, 16.6f, 11.69f, 16f)
                curveTo(11.79f, 16f, 11.89f, 16f, 12f, 16f)
                curveTo(13.25f, 16f, 14.32f, 16.5f, 14.77f, 17.23f)
                lineTo(16.19f, 15.81f)
                curveTo(15.29f, 14.72f, 13.75f, 14f, 12f, 14f)
                curveTo(11.59f, 14f, 11.19f, 14.04f, 10.81f, 14.12f)
                curveTo(10.38f, 13.36f, 9.85f, 12.53f, 9.19f, 11.63f)
                lineTo(8.71f, 11f)
                curveTo(9.42f, 10.87f, 10f, 10.23f, 10f, 9.5f)
                curveTo(10f, 8.7f, 9.3f, 8f, 8.5f, 8f)
                curveTo(7.7f, 8f, 7f, 8.7f, 7f, 9.5f)
                curveTo(7f, 9.69f, 7.04f, 9.87f, 7.11f, 10.04f)
                lineTo(5.96f, 11.63f)
                curveTo(4.4f, 13.75f, 3.5f, 15.5f, 3.23f, 16.81f)
                curveTo(2.45f, 15.38f, 2f, 13.74f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(17f, 9.5f)
                curveTo(17f, 8.7f, 16.3f, 8f, 15.5f, 8f)
                curveTo(14.7f, 8f, 14f, 8.7f, 14f, 9.5f)
                curveTo(14f, 10.3f, 14.7f, 11f, 15.5f, 11f)
                curveTo(16.3f, 11f, 17f, 10.3f, 17f, 9.5f)
                close()
            }
        }.build()

        return _EmoticonCry!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonCry: ImageVector? = null
