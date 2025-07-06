package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ballot: ImageVector
    get() {
        if (_Ballot != null) {
            return _Ballot!!
        }
        _Ballot = ImageVector.Builder(
            name = "Ballot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9.5f)
                horizontalLineTo(18f)
                verticalLineTo(7.5f)
                horizontalLineTo(13f)
                verticalLineTo(9.5f)
                moveTo(13f, 16.5f)
                horizontalLineTo(18f)
                verticalLineTo(14.5f)
                horizontalLineTo(13f)
                verticalLineTo(16.5f)
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                moveTo(6f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                moveTo(7f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(6f, 18f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                moveTo(7f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _Ballot!!
    }

@Suppress("ObjectPropertyName")
private var _Ballot: ImageVector? = null
