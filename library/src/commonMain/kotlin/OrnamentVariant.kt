package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.OrnamentVariant: ImageVector
    get() {
        if (_OrnamentVariant != null) {
            return _OrnamentVariant!!
        }
        _OrnamentVariant = ImageVector.Builder(
            name = "OrnamentVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 4f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 6f)
                verticalLineTo(7.07f)
                curveTo(18.39f, 8.45f, 20f, 11.04f, 20f, 14f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 14f)
                curveTo(4f, 11.04f, 5.61f, 8.45f, 8f, 7.07f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                verticalLineTo(4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                moveTo(12f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(12f, 8f)
                curveTo(10.22f, 8f, 8.63f, 8.77f, 7.53f, 10f)
                horizontalLineTo(16.47f)
                curveTo(15.37f, 8.77f, 13.78f, 8f, 12f, 8f)
                moveTo(12f, 20f)
                curveTo(13.78f, 20f, 15.37f, 19.23f, 16.47f, 18f)
                horizontalLineTo(7.53f)
                curveTo(8.63f, 19.23f, 10.22f, 20f, 12f, 20f)
                moveTo(12f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                moveTo(18f, 14f)
                curveTo(18f, 13.31f, 17.88f, 12.65f, 17.67f, 12f)
                curveTo(16.72f, 12.19f, 16f, 13f, 16f, 14f)
                curveTo(16f, 15f, 16.72f, 15.81f, 17.67f, 15.97f)
                curveTo(17.88f, 15.35f, 18f, 14.69f, 18f, 14f)
                moveTo(6f, 14f)
                curveTo(6f, 14.69f, 6.12f, 15.35f, 6.33f, 15.97f)
                curveTo(7.28f, 15.81f, 8f, 15f, 8f, 14f)
                curveTo(8f, 13f, 7.28f, 12.19f, 6.33f, 12f)
                curveTo(6.12f, 12.65f, 6f, 13.31f, 6f, 14f)
                close()
            }
        }.build()

        return _OrnamentVariant!!
    }

@Suppress("ObjectPropertyName")
private var _OrnamentVariant: ImageVector? = null
