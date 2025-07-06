package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HeadphonesSettings: ImageVector
    get() {
        if (_HeadphonesSettings != null) {
            return _HeadphonesSettings!!
        }
        _HeadphonesSettings = ImageVector.Builder(
            name = "HeadphonesSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 10f)
                verticalLineTo(17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                verticalLineTo(10f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                moveTo(15f, 24f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(24f)
                horizontalLineTo(15f)
                moveTo(11f, 24f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(24f)
                horizontalLineTo(11f)
                moveTo(7f, 24f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _HeadphonesSettings!!
    }

@Suppress("ObjectPropertyName")
private var _HeadphonesSettings: ImageVector? = null
