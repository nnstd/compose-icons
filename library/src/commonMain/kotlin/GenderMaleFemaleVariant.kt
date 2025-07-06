package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GenderMaleFemaleVariant: ImageVector
    get() {
        if (_GenderMaleFemaleVariant != null) {
            return _GenderMaleFemaleVariant!!
        }
        _GenderMaleFemaleVariant = ImageVector.Builder(
            name = "GenderMaleFemaleVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 3f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 15.9f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(11f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(15.9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 3f)
                horizontalLineTo(15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 3f)
                moveTo(12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                close()
            }
        }.build()

        return _GenderMaleFemaleVariant!!
    }

@Suppress("ObjectPropertyName")
private var _GenderMaleFemaleVariant: ImageVector? = null
