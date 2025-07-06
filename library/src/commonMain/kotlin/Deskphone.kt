package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Deskphone: ImageVector
    get() {
        if (_Deskphone != null) {
            return _Deskphone!!
        }
        _Deskphone = ImageVector.Builder(
            name = "Deskphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(15f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(5f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(5f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                moveTo(8f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                moveTo(11f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(5f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                moveTo(8f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                moveTo(11f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                moveTo(11f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(8f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(10f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                moveTo(5f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _Deskphone!!
    }

@Suppress("ObjectPropertyName")
private var _Deskphone: ImageVector? = null
