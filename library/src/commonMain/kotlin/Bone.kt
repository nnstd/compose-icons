package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bone: ImageVector
    get() {
        if (_Bone != null) {
            return _Bone!!
        }
        _Bone = ImageVector.Builder(
            name = "Bone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14f)
                curveTo(2f, 13.23f, 2.29f, 12.53f, 2.76f, 12f)
                curveTo(2.29f, 11.47f, 2f, 10.77f, 2f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                curveTo(9.33f, 10.08f, 10.67f, 10.17f, 12f, 10.17f)
                curveTo(13.33f, 10.17f, 14.67f, 10.08f, 16f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 10f)
                curveTo(22f, 10.77f, 21.71f, 11.47f, 21.24f, 12f)
                curveTo(21.71f, 12.53f, 22f, 13.23f, 22f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 14f)
                curveTo(14.67f, 13.92f, 13.33f, 13.83f, 12f, 13.83f)
                curveTo(10.67f, 13.83f, 9.33f, 13.92f, 8f, 14f)
                close()
            }
        }.build()

        return _Bone!!
    }

@Suppress("ObjectPropertyName")
private var _Bone: ImageVector? = null
