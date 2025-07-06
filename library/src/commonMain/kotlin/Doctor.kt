package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Doctor: ImageVector
    get() {
        if (_Doctor != null) {
            return _Doctor!!
        }
        _Doctor = ImageVector.Builder(
            name = "Doctor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.84f, 16.26f)
                curveTo(17.86f, 16.83f, 20f, 18.29f, 20f, 20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                curveTo(4f, 18.29f, 6.14f, 16.83f, 9.16f, 16.26f)
                lineTo(12f, 21f)
                lineTo(14.84f, 16.26f)
                moveTo(8f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 10f)
                verticalLineTo(8f)
                moveTo(8f, 7f)
                lineTo(8.41f, 2.9f)
                curveTo(8.46f, 2.39f, 8.89f, 2f, 9.41f, 2f)
                horizontalLineTo(14.6f)
                curveTo(15.11f, 2f, 15.54f, 2.39f, 15.59f, 2.9f)
                lineTo(16f, 7f)
                horizontalLineTo(8f)
                moveTo(12f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Doctor!!
    }

@Suppress("ObjectPropertyName")
private var _Doctor: ImageVector? = null
