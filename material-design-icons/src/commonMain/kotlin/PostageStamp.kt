package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PostageStamp: ImageVector
    get() {
        if (_PostageStamp != null) {
            return _PostageStamp!!
        }
        _PostageStamp = ImageVector.Builder(
            name = "PostageStamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                verticalLineTo(5.5f)
                curveTo(3.1f, 5.5f, 4f, 6.62f, 4f, 8f)
                curveTo(4f, 9.38f, 3.1f, 10.5f, 2f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(3.1f, 13.5f, 4f, 14.62f, 4f, 16f)
                curveTo(4f, 17.38f, 3.1f, 18.5f, 2f, 18.5f)
                verticalLineTo(22f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.9f, 6.62f, 20f, 8f, 20f)
                curveTo(9.38f, 20f, 10.5f, 20.9f, 10.5f, 22f)
                horizontalLineTo(13.5f)
                curveTo(13.5f, 20.9f, 14.62f, 20f, 16f, 20f)
                curveTo(17.38f, 20f, 18.5f, 20.9f, 18.5f, 22f)
                horizontalLineTo(22f)
                verticalLineTo(18.5f)
                curveTo(20.9f, 18.5f, 20f, 17.38f, 20f, 16f)
                verticalLineTo(16f)
                curveTo(20f, 14.62f, 20.9f, 13.5f, 22f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(20.9f, 10.5f, 20f, 9.38f, 20f, 8f)
                verticalLineTo(8f)
                curveTo(20f, 6.62f, 20.9f, 5.5f, 22f, 5.5f)
                verticalLineTo(2f)
                horizontalLineTo(18.5f)
                curveTo(18.5f, 3.1f, 17.38f, 4f, 16f, 4f)
                curveTo(14.62f, 4f, 13.5f, 3.1f, 13.5f, 2f)
                horizontalLineTo(10.5f)
                curveTo(10.5f, 3.1f, 9.38f, 4f, 8f, 4f)
                curveTo(6.62f, 4f, 5.5f, 3.1f, 5.5f, 2f)
                horizontalLineTo(2f)
                moveTo(6f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                moveTo(9f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                moveTo(17f, 10f)
                lineTo(14f, 13f)
                lineTo(12f, 12f)
                lineTo(7f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _PostageStamp!!
    }

@Suppress("ObjectPropertyName")
private var _PostageStamp: ImageVector? = null
