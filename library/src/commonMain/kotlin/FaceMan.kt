package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceMan: ImageVector
    get() {
        if (_FaceMan != null) {
            return _FaceMan!!
        }
        _FaceMan = ImageVector.Builder(
            name = "FaceMan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11.75f)
                moveTo(15f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11.75f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                curveTo(4f, 11.71f, 4f, 11.42f, 4.05f, 11.14f)
                curveTo(6.41f, 10.09f, 8.28f, 8.16f, 9.26f, 5.77f)
                curveTo(11.07f, 8.33f, 14.05f, 10f, 17.42f, 10f)
                curveTo(18.2f, 10f, 18.95f, 9.91f, 19.67f, 9.74f)
                curveTo(19.88f, 10.45f, 20f, 11.21f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                close()
            }
        }.build()

        return _FaceMan!!
    }

@Suppress("ObjectPropertyName")
private var _FaceMan: ImageVector? = null
