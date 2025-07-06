package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountGroupOutline: ImageVector
    get() {
        if (_AccountGroupOutline != null) {
            return _AccountGroupOutline!!
        }
        _AccountGroupOutline = ImageVector.Builder(
            name = "AccountGroupOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 8.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(12f, 7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 10f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 8.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                moveTo(5.5f, 8f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 10.5f)
                curveTo(3f, 11.44f, 3.53f, 12.25f, 4.29f, 12.68f)
                curveTo(4.65f, 12.88f, 5.06f, 13f, 5.5f, 13f)
                curveTo(5.94f, 13f, 6.35f, 12.88f, 6.71f, 12.68f)
                curveTo(7.08f, 12.47f, 7.39f, 12.17f, 7.62f, 11.81f)
                curveTo(6.89f, 10.86f, 6.5f, 9.7f, 6.5f, 8.5f)
                curveTo(6.5f, 8.41f, 6.5f, 8.31f, 6.5f, 8.22f)
                curveTo(6.2f, 8.08f, 5.86f, 8f, 5.5f, 8f)
                moveTo(18.5f, 8f)
                curveTo(18.14f, 8f, 17.8f, 8.08f, 17.5f, 8.22f)
                curveTo(17.5f, 8.31f, 17.5f, 8.41f, 17.5f, 8.5f)
                curveTo(17.5f, 9.7f, 17.11f, 10.86f, 16.38f, 11.81f)
                curveTo(16.5f, 12f, 16.63f, 12.15f, 16.78f, 12.3f)
                curveTo(16.94f, 12.45f, 17.1f, 12.58f, 17.29f, 12.68f)
                curveTo(17.65f, 12.88f, 18.06f, 13f, 18.5f, 13f)
                curveTo(18.94f, 13f, 19.35f, 12.88f, 19.71f, 12.68f)
                curveTo(20.47f, 12.25f, 21f, 11.44f, 21f, 10.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 8f)
                moveTo(12f, 14f)
                curveTo(9.66f, 14f, 5f, 15.17f, 5f, 17.5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(17.5f)
                curveTo(19f, 15.17f, 14.34f, 14f, 12f, 14f)
                moveTo(4.71f, 14.55f)
                curveTo(2.78f, 14.78f, 0f, 15.76f, 0f, 17.5f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(17.07f)
                curveTo(3f, 16.06f, 3.69f, 15.22f, 4.71f, 14.55f)
                moveTo(19.29f, 14.55f)
                curveTo(20.31f, 15.22f, 21f, 16.06f, 21f, 17.07f)
                verticalLineTo(19f)
                horizontalLineTo(24f)
                verticalLineTo(17.5f)
                curveTo(24f, 15.76f, 21.22f, 14.78f, 19.29f, 14.55f)
                moveTo(12f, 16f)
                curveTo(13.53f, 16f, 15.24f, 16.5f, 16.23f, 17f)
                horizontalLineTo(7.77f)
                curveTo(8.76f, 16.5f, 10.47f, 16f, 12f, 16f)
                close()
            }
        }.build()

        return _AccountGroupOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountGroupOutline: ImageVector? = null
