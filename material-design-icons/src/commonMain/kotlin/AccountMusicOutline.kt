package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMusicOutline: ImageVector
    get() {
        if (_AccountMusicOutline != null) {
            return _AccountMusicOutline!!
        }
        _AccountMusicOutline = ImageVector.Builder(
            name = "AccountMusicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4f)
                moveTo(11f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 6f)
                moveTo(11f, 13f)
                curveTo(12.1f, 13f, 13.66f, 13.23f, 15.11f, 13.69f)
                curveTo(14.5f, 14.07f, 14f, 14.6f, 13.61f, 15.23f)
                curveTo(12.79f, 15.03f, 11.89f, 14.9f, 11f, 14.9f)
                curveTo(8.03f, 14.9f, 4.9f, 16.36f, 4.9f, 17f)
                verticalLineTo(18.1f)
                horizontalLineTo(13.04f)
                curveTo(13.13f, 18.8f, 13.38f, 19.44f, 13.76f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                curveTo(3f, 14.34f, 8.33f, 13f, 11f, 13f)
                moveTo(18.5f, 10f)
                horizontalLineTo(20f)
                lineTo(22f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 15f)
                curveTo(17.86f, 15f, 18.19f, 15.07f, 18.5f, 15.21f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _AccountMusicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMusicOutline: ImageVector? = null
