package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FaceRecognition: ImageVector
    get() {
        if (_FaceRecognition != null) {
            return _FaceRecognition!!
        }
        _FaceRecognition = ImageVector.Builder(
            name = "FaceRecognition",
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
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 12f)
                curveTo(3.97f, 11.71f, 3.97f, 11.43f, 4f, 11.14f)
                curveTo(6.38f, 10.1f, 8.27f, 8.17f, 9.26f, 5.77f)
                curveTo(11.13f, 8.42f, 14.17f, 10f, 17.42f, 10f)
                curveTo(18.18f, 10f, 18.93f, 9.91f, 19.67f, 9.74f)
                curveTo(20.92f, 14f, 18.5f, 18.43f, 14.26f, 19.67f)
                curveTo(13.5f, 19.89f, 12.76f, 20f, 12f, 20f)
                moveTo(0f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(2f)
                moveTo(24f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 24f)
                horizontalLineTo(18f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                moveTo(2f, 24f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(6f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                moveTo(22f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(0f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _FaceRecognition!!
    }

@Suppress("ObjectPropertyName")
private var _FaceRecognition: ImageVector? = null
