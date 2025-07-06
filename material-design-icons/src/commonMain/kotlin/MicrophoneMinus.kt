package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MicrophoneMinus: ImageVector
    get() {
        if (_MicrophoneMinus != null) {
            return _MicrophoneMinus!!
        }
        _MicrophoneMinus = ImageVector.Builder(
            name = "MicrophoneMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                verticalLineTo(11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 11f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                moveTo(16f, 11f)
                curveTo(16f, 14.5f, 13.44f, 17.43f, 10f, 17.93f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(17.93f)
                curveTo(4.56f, 17.43f, 2f, 14.5f, 2f, 11f)
                horizontalLineTo(4f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 11f)
                horizontalLineTo(16f)
                moveTo(15f, 5f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _MicrophoneMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneMinus: ImageVector? = null
