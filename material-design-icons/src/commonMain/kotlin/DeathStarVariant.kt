package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeathStarVariant: ImageVector
    get() {
        if (_DeathStarVariant != null) {
            return _DeathStarVariant!!
        }
        _DeathStarVariant = ImageVector.Builder(
            name = "DeathStarVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.05f, 13f)
                horizontalLineTo(21.94f)
                curveTo(21.88f, 13.69f, 21.74f, 14.36f, 21.54f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(12.5f)
                verticalLineTo(22f)
                curveTo(12.33f, 22f, 12.17f, 22f, 12f, 22f)
                curveTo(6.82f, 22f, 2.55f, 18.05f, 2.05f, 13f)
                moveTo(21.94f, 11f)
                horizontalLineTo(2.05f)
                curveTo(2.55f, 5.95f, 6.82f, 2f, 12f, 2f)
                curveTo(13.62f, 2f, 15.15f, 2.39f, 16.5f, 3.08f)
                verticalLineTo(5f)
                horizontalLineTo(18.5f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(21.54f)
                curveTo(21.74f, 9.64f, 21.88f, 10.31f, 21.94f, 11f)
                moveTo(12f, 6.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 4.25f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6.75f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 9.25f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6.75f)
                close()
            }
        }.build()

        return _DeathStarVariant!!
    }

@Suppress("ObjectPropertyName")
private var _DeathStarVariant: ImageVector? = null
