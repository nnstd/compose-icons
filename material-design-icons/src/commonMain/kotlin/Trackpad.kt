package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Trackpad: ImageVector
    get() {
        if (_Trackpad != null) {
            return _Trackpad!!
        }
        _Trackpad = ImageVector.Builder(
            name = "Trackpad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                moveTo(4f, 5f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                moveTo(4f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                moveTo(20f, 19f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Trackpad!!
    }

@Suppress("ObjectPropertyName")
private var _Trackpad: ImageVector? = null
