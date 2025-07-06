package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonCryOutline: ImageVector
    get() {
        if (_EmoticonCryOutline != null) {
            return _EmoticonCryOutline!!
        }
        _EmoticonCryOutline = ImageVector.Builder(
            name = "EmoticonCryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.57f, 20f)
                curveTo(6.23f, 20f, 5.14f, 18.91f, 5.14f, 17.57f)
                curveTo(5.14f, 16.5f, 6.32f, 14.5f, 7.57f, 12.81f)
                curveTo(8.82f, 14.5f, 10f, 16.5f, 10f, 17.57f)
                arcTo(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.57f, 20f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                curveTo(2f, 13.75f, 2.45f, 15.38f, 3.24f, 16.81f)
                curveTo(3.4f, 16f, 3.81f, 15.07f, 4.31f, 14.17f)
                curveTo(4.11f, 13.5f, 4f, 12.75f, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                curveTo(11.76f, 20f, 11.53f, 20f, 11.29f, 19.96f)
                curveTo(10.82f, 20.7f, 10.14f, 21.28f, 9.34f, 21.63f)
                curveTo(10.19f, 21.87f, 11.08f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 14f)
                curveTo(11.59f, 14f, 11.19f, 14.04f, 10.81f, 14.12f)
                curveTo(11.16f, 14.75f, 11.47f, 15.4f, 11.69f, 16f)
                curveTo(11.79f, 16f, 11.89f, 16f, 12f, 16f)
                curveTo(13.25f, 16f, 14.32f, 16.5f, 14.77f, 17.23f)
                lineTo(16.19f, 15.81f)
                curveTo(15.29f, 14.72f, 13.75f, 14f, 12f, 14f)
                moveTo(15.5f, 8f)
                curveTo(14.7f, 8f, 14f, 8.7f, 14f, 9.5f)
                curveTo(14f, 10.3f, 14.7f, 11f, 15.5f, 11f)
                curveTo(16.3f, 11f, 17f, 10.3f, 17f, 9.5f)
                curveTo(17f, 8.7f, 16.3f, 8f, 15.5f, 8f)
                moveTo(10f, 9.5f)
                curveTo(10f, 8.7f, 9.3f, 8f, 8.5f, 8f)
                curveTo(7.7f, 8f, 7f, 8.7f, 7f, 9.5f)
                curveTo(7f, 10.3f, 7.7f, 11f, 8.5f, 11f)
                curveTo(9.3f, 11f, 10f, 10.3f, 10f, 9.5f)
            }
        }.build()

        return _EmoticonCryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonCryOutline: ImageVector? = null
