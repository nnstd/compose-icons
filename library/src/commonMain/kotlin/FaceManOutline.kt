package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceManOutline: ImageVector
    get() {
        if (_FaceManOutline != null) {
            return _FaceManOutline!!
        }
        _FaceManOutline = ImageVector.Builder(
            name = "FaceManOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.25f, 13f)
                moveTo(15f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 11.75f)
                moveTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                moveTo(10.66f, 4.12f)
                curveTo(12.06f, 6.44f, 14.6f, 8f, 17.5f, 8f)
                curveTo(17.96f, 8f, 18.41f, 7.95f, 18.84f, 7.88f)
                curveTo(17.44f, 5.56f, 14.9f, 4f, 12f, 4f)
                curveTo(11.54f, 4f, 11.09f, 4.05f, 10.66f, 4.12f)
                moveTo(4.42f, 9.47f)
                curveTo(6.13f, 8.5f, 7.45f, 6.92f, 8.08f, 5.03f)
                curveTo(6.37f, 6f, 5.05f, 7.58f, 4.42f, 9.47f)
                moveTo(20f, 12f)
                curveTo(20f, 11.22f, 19.88f, 10.47f, 19.67f, 9.76f)
                curveTo(18.97f, 9.91f, 18.25f, 10f, 17.5f, 10f)
                curveTo(14.37f, 10f, 11.58f, 8.56f, 9.74f, 6.31f)
                curveTo(8.69f, 8.87f, 6.6f, 10.88f, 4f, 11.86f)
                curveTo(4f, 11.9f, 4f, 11.95f, 4f, 12f)
                curveTo(4f, 16.41f, 7.59f, 20f, 12f, 20f)
                curveTo(16.41f, 20f, 20f, 16.41f, 20f, 12f)
                close()
            }
        }.build()

        return _FaceManOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FaceManOutline: ImageVector? = null
