package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FootballHelmet: ImageVector
    get() {
        if (_FootballHelmet != null) {
            return _FootballHelmet!!
        }
        _FootballHelmet = ImageVector.Builder(
            name = "FootballHelmet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 12f)
                moveTo(13.5f, 3f)
                curveTo(18.19f, 3f, 22f, 6.58f, 22f, 11f)
                curveTo(22f, 12.62f, 22f, 14f, 21.09f, 16f)
                curveTo(17f, 16f, 16f, 20f, 12.5f, 20f)
                curveTo(10.32f, 20f, 9.27f, 18.28f, 9.05f, 16f)
                horizontalLineTo(9f)
                lineTo(8.24f, 16f)
                lineTo(6.96f, 20.3f)
                curveTo(6.81f, 20.79f, 6.33f, 21.08f, 5.84f, 21f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(16f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 15f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 14f)
                horizontalLineTo(6.75f)
                lineTo(7.23f, 12.39f)
                curveTo(6.72f, 12.14f, 6.13f, 12f, 5.5f, 12f)
                horizontalLineTo(5.07f)
                lineTo(5f, 11f)
                curveTo(5f, 6.58f, 8.81f, 3f, 13.5f, 3f)
                moveTo(5f, 16f)
                verticalLineTo(19f)
                horizontalLineTo(5.26f)
                lineTo(6.15f, 16f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _FootballHelmet!!
    }

@Suppress("ObjectPropertyName")
private var _FootballHelmet: ImageVector? = null
