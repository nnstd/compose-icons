package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BallotOutline: ImageVector
    get() {
        if (_BallotOutline != null) {
            return _BallotOutline!!
        }
        _BallotOutline = ImageVector.Builder(
            name = "BallotOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 7.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(13f)
                verticalLineTo(7.5f)
                moveTo(13f, 14.5f)
                horizontalLineTo(18f)
                verticalLineTo(16.5f)
                horizontalLineTo(13f)
                verticalLineTo(14.5f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(19f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
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
                moveTo(11f, 13f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(10f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _BallotOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BallotOutline: ImageVector? = null
