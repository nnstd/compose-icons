package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BallotRecountOutline: ImageVector
    get() {
        if (_BallotRecountOutline != null) {
            return _BallotRecountOutline!!
        }
        _BallotRecountOutline = ImageVector.Builder(
            name = "BallotRecountOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 18f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                moveTo(7f, 14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                moveTo(13f, 7.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(13f)
                verticalLineTo(7.5f)
                moveTo(5f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(11.17f)
                curveTo(20.5f, 11.06f, 20f, 11f, 19.5f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(13.17f)
                curveTo(13.34f, 19.72f, 13.63f, 20.39f, 14f, 21f)
                horizontalLineTo(5f)
                moveTo(11f, 6f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                moveTo(10f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
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
                close()
            }
        }.build()

        return _BallotRecountOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BallotRecountOutline: ImageVector? = null
