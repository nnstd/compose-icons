package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DomainPlus: ImageVector
    get() {
        if (_DomainPlus != null) {
            return _DomainPlus!!
        }
        _DomainPlus = ImageVector.Builder(
            name = "DomainPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(21f)
                horizontalLineTo(13.35f)
                arcTo(5.8f, 5.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 19f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                horizontalLineTo(13.35f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15.69f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(13.09f)
                arcTo(5.58f, 5.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13.81f)
                verticalLineTo(7f)
                moveTo(6f, 19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                moveTo(6f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                moveTo(6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                moveTo(6f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                moveTo(10f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                moveTo(10f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                moveTo(10f, 11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                moveTo(10f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                moveTo(16f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                moveTo(16f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(16f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                moveTo(20f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(23f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(23f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _DomainPlus!!
    }

@Suppress("ObjectPropertyName")
private var _DomainPlus: ImageVector? = null
