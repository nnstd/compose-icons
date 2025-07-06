package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrystalBall: ImageVector
    get() {
        if (_CrystalBall != null) {
            return _CrystalBall!!
        }
        _CrystalBall = ImageVector.Builder(
            name = "CrystalBall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.38f, 8.38f)
                lineTo(11.5f, 9.34f)
                lineTo(13.62f, 8.38f)
                lineTo(12.66f, 10.5f)
                lineTo(13.62f, 12.62f)
                lineTo(11.5f, 11.66f)
                lineTo(9.38f, 12.62f)
                lineTo(10.34f, 10.5f)
                lineTo(9.38f, 8.38f)
                moveTo(16.5f, 2.5f)
                lineTo(17.59f, 5.41f)
                lineTo(20.5f, 6.5f)
                lineTo(17.59f, 7.59f)
                lineTo(16.5f, 10.5f)
                lineTo(15.41f, 7.59f)
                lineTo(12.5f, 6.5f)
                lineTo(15.41f, 5.41f)
                lineTo(16.5f, 2.5f)
                moveTo(6f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 17f)
                horizontalLineTo(8.26f)
                curveTo(6f, 15.7f, 4.5f, 13.28f, 4.5f, 10.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                curveTo(13.05f, 3f, 14.05f, 3.22f, 14.96f, 3.61f)
                lineTo(14.59f, 4.59f)
                lineTo(13.17f, 5.12f)
                curveTo(12.79f, 5.04f, 12.4f, 5f, 12f, 5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 10.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                curveTo(14.91f, 16f, 17.3f, 13.73f, 17.5f, 10.87f)
                lineTo(18.41f, 8.41f)
                lineTo(19.12f, 8.14f)
                curveTo(19.37f, 8.88f, 19.5f, 9.68f, 19.5f, 10.5f)
                curveTo(19.5f, 13.28f, 18f, 15.7f, 15.74f, 17f)
                horizontalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 18f)
                verticalLineTo(19f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                close()
            }
        }.build()

        return _CrystalBall!!
    }

@Suppress("ObjectPropertyName")
private var _CrystalBall: ImageVector? = null
