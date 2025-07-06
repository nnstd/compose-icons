package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceManProfile: ImageVector
    get() {
        if (_FaceManProfile != null) {
            return _FaceManProfile!!
        }
        _FaceManProfile = ImageVector.Builder(
            name = "FaceManProfile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 8.39f)
                curveTo(13.57f, 9.4f, 15.42f, 10f, 17.42f, 10f)
                curveTo(18.2f, 10f, 18.95f, 9.91f, 19.67f, 9.74f)
                curveTo(19.88f, 10.45f, 20f, 11.21f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                curveTo(9f, 20f, 6.39f, 18.34f, 5f, 15.89f)
                lineTo(6.75f, 14f)
                verticalLineTo(13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.25f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                moveTo(16f, 11.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.75f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 14.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.25f, 13f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11.75f)
                close()
            }
        }.build()

        return _FaceManProfile!!
    }

@Suppress("ObjectPropertyName")
private var _FaceManProfile: ImageVector? = null
