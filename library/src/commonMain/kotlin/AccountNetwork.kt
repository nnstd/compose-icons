package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountNetwork: ImageVector
    get() {
        if (_AccountNetwork != null) {
            return _AccountNetwork!!
        }
        _AccountNetwork = ImageVector.Builder(
            name = "AccountNetwork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 23f)
                horizontalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15.5f)
                curveTo(5f, 13.57f, 8.13f, 12f, 12f, 12f)
                curveTo(15.87f, 12f, 19f, 13.57f, 19f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(12f, 3f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 6.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
            }
        }.build()

        return _AccountNetwork!!
    }

@Suppress("ObjectPropertyName")
private var _AccountNetwork: ImageVector? = null
