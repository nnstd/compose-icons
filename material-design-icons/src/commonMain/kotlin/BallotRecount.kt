package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BallotRecount: ImageVector
    get() {
        if (_BallotRecount != null) {
            return _BallotRecount!!
        }
        _BallotRecount = ImageVector.Builder(
            name = "BallotRecount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 12f)
                verticalLineTo(13.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 17.5f)
                curveTo(23f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 15f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 12f)
                moveTo(19f, 23f)
                verticalLineTo(21.5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.5f)
                curveTo(15f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 20f)
                verticalLineTo(18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 23f)
                moveTo(10f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                moveTo(10f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                moveTo(5f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(11.17f)
                curveTo(20.5f, 11.06f, 20f, 11f, 19.5f, 11f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17.5f)
                curveTo(13f, 18.79f, 13.38f, 20f, 14f, 21f)
                horizontalLineTo(5f)
                moveTo(13f, 9.5f)
                horizontalLineTo(18f)
                verticalLineTo(7.5f)
                horizontalLineTo(13f)
                verticalLineTo(9.5f)
                moveTo(11f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(11f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _BallotRecount!!
    }

@Suppress("ObjectPropertyName")
private var _BallotRecount: ImageVector? = null
