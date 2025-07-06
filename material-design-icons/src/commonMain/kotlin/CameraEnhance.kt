package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraEnhance: ImageVector
    get() {
        if (_CameraEnhance != null) {
            return _CameraEnhance!!
        }
        _CameraEnhance = ImageVector.Builder(
            name = "CameraEnhance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 3f)
                lineTo(7.17f, 5f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                horizontalLineTo(16.83f)
                lineTo(15f, 3f)
                moveTo(12f, 18f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                moveTo(12f, 17f)
                lineTo(13.25f, 14.25f)
                lineTo(16f, 13f)
                lineTo(13.25f, 11.75f)
                lineTo(12f, 9f)
                lineTo(10.75f, 11.75f)
                lineTo(8f, 13f)
                lineTo(10.75f, 14.25f)
            }
        }.build()

        return _CameraEnhance!!
    }

@Suppress("ObjectPropertyName")
private var _CameraEnhance: ImageVector? = null
