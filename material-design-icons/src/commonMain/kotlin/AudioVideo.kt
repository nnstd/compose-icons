package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AudioVideo: ImageVector
    get() {
        if (_AudioVideo != null) {
            return _AudioVideo!!
        }
        _AudioVideo = ImageVector.Builder(
            name = "AudioVideo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                curveTo(5f, 18.6f, 5.4f, 19f, 6f, 19f)
                horizontalLineTo(8f)
                curveTo(8.6f, 19f, 9f, 18.6f, 9f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                curveTo(15f, 18.6f, 15.4f, 19f, 16f, 19f)
                horizontalLineTo(18f)
                curveTo(18.6f, 19f, 19f, 18.6f, 19f, 18f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 7f)
                moveTo(14f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                moveTo(18f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                moveTo(14f, 15f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _AudioVideo!!
    }

@Suppress("ObjectPropertyName")
private var _AudioVideo: ImageVector? = null
