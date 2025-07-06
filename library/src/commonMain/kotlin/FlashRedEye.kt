package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashRedEye: ImageVector
    get() {
        if (_FlashRedEye != null) {
            return _FlashRedEye!!
        }
        _FlashRedEye = ImageVector.Builder(
            name = "FlashRedEye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 5f)
                curveTo(15.44f, 5f, 15f, 5.44f, 15f, 6f)
                curveTo(15f, 6.56f, 15.44f, 7f, 16f, 7f)
                curveTo(16.56f, 7f, 17f, 6.56f, 17f, 6f)
                curveTo(17f, 5.44f, 16.56f, 5f, 16f, 5f)
                moveTo(16f, 2f)
                curveTo(13.27f, 2f, 10.94f, 3.66f, 10f, 6f)
                curveTo(10.94f, 8.34f, 13.27f, 10f, 16f, 10f)
                curveTo(18.73f, 10f, 21.06f, 8.34f, 22f, 6f)
                curveTo(21.06f, 3.66f, 18.73f, 2f, 16f, 2f)
                moveTo(16f, 3.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 6f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 6f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 3.5f)
                moveTo(3f, 2f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(23f)
                lineTo(13f, 11f)
                horizontalLineTo(9f)
                lineTo(10.12f, 8.5f)
                curveTo(9.44f, 7.76f, 8.88f, 6.93f, 8.5f, 6f)
                curveTo(9.19f, 4.29f, 10.5f, 2.88f, 12.11f, 2f)
                horizontalLineTo(3f)
                close()
            }
        }.build()

        return _FlashRedEye!!
    }

@Suppress("ObjectPropertyName")
private var _FlashRedEye: ImageVector? = null
