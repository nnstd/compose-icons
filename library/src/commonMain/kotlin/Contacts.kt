package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Contacts: ImageVector
    get() {
        if (_Contacts != null) {
            return _Contacts!!
        }
        _Contacts = ImageVector.Builder(
            name = "Contacts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                horizontalLineTo(4f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                moveTo(4f, 24f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(24f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4f)
                moveTo(12f, 6.75f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 9f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11.25f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.75f, 9f)
                arcTo(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6.75f)
                moveTo(17f, 17f)
                horizontalLineTo(7f)
                verticalLineTo(15.5f)
                curveTo(7f, 13.83f, 10.33f, 13f, 12f, 13f)
                curveTo(13.67f, 13f, 17f, 13.83f, 17f, 15.5f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Contacts!!
    }

@Suppress("ObjectPropertyName")
private var _Contacts: ImageVector? = null
