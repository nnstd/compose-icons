package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoleculeCo2: ImageVector
    get() {
        if (_MoleculeCo2 != null) {
            return _MoleculeCo2!!
        }
        _MoleculeCo2 = ImageVector.Builder(
            name = "MoleculeCo2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 17f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                moveTo(11f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                horizontalLineTo(11f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(16f, 10.5f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(20.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 13.5f)
                verticalLineTo(12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 10.5f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _MoleculeCo2!!
    }

@Suppress("ObjectPropertyName")
private var _MoleculeCo2: ImageVector? = null
