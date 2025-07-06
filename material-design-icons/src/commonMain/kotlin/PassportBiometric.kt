package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PassportBiometric: ImageVector
    get() {
        if (_PassportBiometric != null) {
            return _PassportBiometric!!
        }
        _PassportBiometric = ImageVector.Builder(
            name = "PassportBiometric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(8.13f)
                curveTo(8.59f, 9.24f, 10.18f, 8f, 12f, 8f)
                curveTo(13.82f, 8f, 15.41f, 9.24f, 15.87f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                horizontalLineTo(4f)
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                moveTo(2f, 13f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(15.87f)
                curveTo(15.41f, 14.76f, 13.82f, 16f, 12f, 16f)
                curveTo(10.18f, 16f, 8.59f, 14.76f, 8.13f, 13f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _PassportBiometric!!
    }

@Suppress("ObjectPropertyName")
private var _PassportBiometric: ImageVector? = null
