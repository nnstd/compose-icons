package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileMusicOutline: ImageVector
    get() {
        if (_FileMusicOutline != null) {
            return _FileMusicOutline!!
        }
        _FileMusicOutline = ImageVector.Builder(
            name = "FileMusicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(14f)
                moveTo(18f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                moveTo(13f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 15f)
                curveTo(9.4f, 15f, 9.7f, 15.1f, 10f, 15.3f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileMusicOutline: ImageVector? = null
