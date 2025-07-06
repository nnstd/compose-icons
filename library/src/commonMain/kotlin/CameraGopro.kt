package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraGopro: ImageVector
    get() {
        if (_CameraGopro != null) {
            return _CameraGopro!!
        }
        _CameraGopro = ImageVector.Builder(
            name = "CameraGopro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 5f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                verticalLineTo(12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                moveTo(17.5f, 12.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 9.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 6.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 9.5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 12.5f)
                moveTo(17.5f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 11f)
                moveTo(12f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 19f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                moveTo(10f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _CameraGopro!!
    }

@Suppress("ObjectPropertyName")
private var _CameraGopro: ImageVector? = null
