package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraEnhanceOutline: ImageVector
    get() {
        if (_CameraEnhanceOutline != null) {
            return _CameraEnhanceOutline!!
        }
        _CameraEnhanceOutline = ImageVector.Builder(
            name = "CameraEnhanceOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                lineTo(11.06f, 12.06f)
                lineTo(9f, 13f)
                lineTo(11.06f, 13.94f)
                lineTo(12f, 16f)
                lineTo(12.94f, 13.94f)
                lineTo(15f, 13f)
                lineTo(12.94f, 12.06f)
                lineTo(12f, 10f)
                moveTo(20f, 5f)
                horizontalLineTo(16.83f)
                lineTo(15f, 3f)
                horizontalLineTo(9f)
                lineTo(7.17f, 5f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 7f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 19f)
                verticalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                moveTo(20f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(8.05f)
                lineTo(8.64f, 6.35f)
                lineTo(9.88f, 5f)
                horizontalLineTo(14.12f)
                lineTo(15.36f, 6.35f)
                lineTo(15.95f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                moveTo(12f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                moveTo(12f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 13f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
            }
        }.build()

        return _CameraEnhanceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraEnhanceOutline: ImageVector? = null
