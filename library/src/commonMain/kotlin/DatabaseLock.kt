package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseLock: ImageVector
    get() {
        if (_DatabaseLock != null) {
            return _DatabaseLock!!
        }
        _DatabaseLock = ImageVector.Builder(
            name = "DatabaseLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 3f)
                curveTo(15.42f, 3f, 19f, 4.79f, 19f, 7f)
                curveTo(19f, 9.21f, 15.42f, 11f, 11f, 11f)
                curveTo(6.58f, 11f, 3f, 9.21f, 3f, 7f)
                curveTo(3f, 4.79f, 6.58f, 3f, 11f, 3f)
                moveTo(19f, 12.03f)
                curveTo(17.11f, 12.24f, 15.57f, 13.62f, 15.13f, 15.43f)
                curveTo(13.92f, 15.79f, 12.5f, 16f, 11f, 16f)
                curveTo(6.58f, 16f, 3f, 14.21f, 3f, 12f)
                verticalLineTo(9f)
                curveTo(3f, 11.21f, 6.58f, 13f, 11f, 13f)
                curveTo(15.42f, 13f, 19f, 11.21f, 19f, 9f)
                verticalLineTo(12.03f)
                moveTo(14f, 17.71f)
                verticalLineTo(20.71f)
                curveTo(13.07f, 20.9f, 12.06f, 21f, 11f, 21f)
                curveTo(6.58f, 21f, 3f, 19.21f, 3f, 17f)
                verticalLineTo(14f)
                curveTo(3f, 16.21f, 6.58f, 18f, 11f, 18f)
                curveTo(12.06f, 18f, 13.07f, 17.9f, 14f, 17.71f)
                moveTo(19.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 16.5f)
                verticalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 18f)
                verticalLineTo(22f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 23f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                verticalLineTo(16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 14f)
                moveTo(19.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 15f)
                close()
            }
        }.build()

        return _DatabaseLock!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseLock: ImageVector? = null
